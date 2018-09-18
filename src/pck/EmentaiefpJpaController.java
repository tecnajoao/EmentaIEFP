/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pck;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import pck.exceptions.NonexistentEntityException;
import pck.exceptions.PreexistingEntityException;

/**
 *
 * @author tecna
 */
public class EmentaiefpJpaController implements Serializable {

    public EmentaiefpJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Ementaiefp ementaiefp) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(ementaiefp);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findEmentaiefp(ementaiefp.getIdementa()) != null) {
                throw new PreexistingEntityException("Ementaiefp " + ementaiefp + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Ementaiefp ementaiefp) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ementaiefp = em.merge(ementaiefp);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Short id = ementaiefp.getIdementa();
                if (findEmentaiefp(id) == null) {
                    throw new NonexistentEntityException("The ementaiefp with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Short id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Ementaiefp ementaiefp;
            try {
                ementaiefp = em.getReference(Ementaiefp.class, id);
                ementaiefp.getIdementa();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The ementaiefp with id " + id + " no longer exists.", enfe);
            }
            em.remove(ementaiefp);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Ementaiefp> findEmentaiefpEntities() {
        return findEmentaiefpEntities(true, -1, -1);
    }

    public List<Ementaiefp> findEmentaiefpEntities(int maxResults, int firstResult) {
        return findEmentaiefpEntities(false, maxResults, firstResult);
    }

    private List<Ementaiefp> findEmentaiefpEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Ementaiefp.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Ementaiefp findEmentaiefp(Short id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Ementaiefp.class, id);
        } finally {
            em.close();
        }
    }

    public int getEmentaiefpCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Ementaiefp> rt = cq.from(Ementaiefp.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
