package shop.mtcoding.blog.model.user;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@RequiredArgsConstructor
@Repository
public class UserRepository {
    private final EntityManager em;
    public List<User> findAll(){
        Query query = em.createNativeQuery("select * from user_tb order by id desc",User.class);

        List<User> userList = query.getResultList();
        return userList;
    }

    public List<User> findByCompAll(){
        Query query = em.createNativeQuery("select * from user_tb where role = 2 order by id desc ",User.class);

        List<User> userList = query.getResultList();
        return userList;
    }


    public void findById(){}

    @Transactional
    public void updateById(){}

    @Transactional
    public void save() {}

    @Transactional
    public void deleteById () {}
}
