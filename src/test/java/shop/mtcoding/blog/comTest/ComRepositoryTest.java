package shop.mtcoding.blog.comTest;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import shop.mtcoding.blog.com.ComRepository;
import shop.mtcoding.blog.com.ComRequest;


@Import(ComRepository.class)
@DataJpaTest
public class ComRepositoryTest {
    @Autowired
    private ComRepository comRepository;

    @Test
    public void joinComTest () {
        //given
        ComRequest.JoinDTO requestDTO = new ComRequest.JoinDTO();
        requestDTO.setComName("안녕1");
        requestDTO.setBizNum("안녕2");
        requestDTO.setEmail("안녕3");
        requestDTO.setPassword("안녕4");
        requestDTO.setPhoto("안녕5");
        requestDTO.setRepresentativeName("안녕6");
        requestDTO.setHomepage("안녕7");
        //when
        comRepository.join(requestDTO);
        //then (눈검증)
        System.out.println(requestDTO.getComName());
        System.out.println(requestDTO.getPassword());
        System.out.println(requestDTO.getEmail());
        System.out.println(requestDTO.getHomepage());
        System.out.println(requestDTO.getRepresentativeName());
        System.out.println(requestDTO.getBizNum());
        System.out.println(requestDTO.getPhoto());
    }
}
