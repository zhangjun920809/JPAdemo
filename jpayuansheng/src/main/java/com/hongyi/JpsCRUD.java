package com.hongyi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author User
 * @date 2020/12/11 12:31
 */
public class JpsCRUD {
    public static EntityManagerFactory factory = null;
    static {
        factory = Persistence.createEntityManagerFactory("jpa-1");
    }
    public static  void insert(UserEntity userEntity ) {
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(userEntity);
        em.getTransaction().commit();
        em.close();
    }

    public static void main(String[] args) {
        UserEntity user = new UserEntity("俊哥", 100);
        insert(user);
    }


}
