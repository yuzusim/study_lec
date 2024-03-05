package shop.mtcoding.blog.controller;



import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import shop.mtcoding.blog.model.jobs.JobRequest;
import shop.mtcoding.blog.model.jobs.Jobs;
import shop.mtcoding.blog.model.jobs.JobsRepository;
import shop.mtcoding.blog.model.user.User;

import java.util.Date;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class JobsController {
    private final JobsRepository jobsRepository;
    private final HttpSession session;

    @GetMapping("/jobs/interest")
    public String interest () {
        return "/jobs/interest";
    }

    @GetMapping("/jobs/info")
    public String info (HttpServletRequest request) {

        List<Jobs> jobsList = jobsRepository.findAllV2();
        request.setAttribute("jobsList", jobsList);

        return "/jobs/info";
    }


    @GetMapping("/jobs/jobsDetail/{id}")
    public String jobsDetail(@PathVariable Integer id, @RequestParam(defaultValue = "0") Integer page) {

        //List<>

        return "/jobs/jobsDetail";
    }

    @GetMapping("/jobs/{Id}/updateJobsForm")
    public String updateJobsForm(@PathVariable Integer Id){

        // 디비에서 아이디 row 들고오기
        Object[] job = jobsRepository.findById(Id);

        //        for(Object o : job){
        //            System.out.println(o);
//        }
        JobRequest.JobJoinDTO jobDTO = JobRequest.JobJoinDTO.builder()
                .compName((String) job[0])
                .businessNumber((String) job[1])
                .phone((String) job[2])
                .area((String) job[3])
                .edu((String) job[4])
                .career((String) job[5])
                .content((String) job[6])
                .title((String) job[7])
                .id((Integer) job[8])
                .homepage((String) job[9])
                .task((String) job[10])
                .userId((Integer) job[11])
                .deadLine(String.valueOf((Date) job[12]))
                .build();

        // row 세션에 담아
        session.setAttribute("job",jobDTO);
        // 머스테치에 세션 데이터값 넣어주기

        return "/jobs/updateJobsForm";
    }

    @PostMapping("/jobs/{id}/update")
    public String updateJob(@PathVariable Integer id, JobRequest.JobUpdateDTO jobUpdateDTO) {

        jobsRepository.update(jobUpdateDTO,id);

        User compId = (User) session.getAttribute("sessionComp");

        // System.out.println(jobUpdateDTO.getCompId());
        return "redirect:/comp/"+ compId.getId() +"/comphome";
    }

    @GetMapping("/jobs/writeJobsForm")
    public String writeJobsForm() {

        return "/jobs/writeJobsForm";
    }

    @PostMapping("/jobs/save")
    public String save(JobRequest.JobWriterDTO jobWriterDTO){
        jobsRepository.save(jobWriterDTO);
        session.setAttribute("jobList",jobWriterDTO);

        return "redirect:/comp/"+ jobWriterDTO.getUserId()+"/comphome";
    }

    @PostMapping("/jobs/{id}/delete")
    public String delete(HttpSession session,@PathVariable Integer id){

            User sessionUser = (User) session.getAttribute("sessionComp");
            Integer compId = sessionUser.getId();
            System.out.println(compId);

            jobsRepository.deleteById(compId,id);

            return "redirect:/comp/"+compId+"/comphome";
    }
}
