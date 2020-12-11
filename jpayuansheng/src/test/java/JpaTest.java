import com.hongyi.UserEntity;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * @author User
 * @date 2020/12/11 10:53
 */
public class JpaTest {

    @Test
    public void insert(){
        //创建工厂对象
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-1");
        //通过工厂对象
        EntityManager em = entityManagerFactory.createEntityManager();
        //获取事务对象
        EntityTransaction et = em.getTransaction();
        //开启事务
        et.begin();
        em.persist(new UserEntity("zhang",99));
        //提交事务
        et.commit();
        //关闭资源
        em.close();
        entityManagerFactory.close();
    }
}
