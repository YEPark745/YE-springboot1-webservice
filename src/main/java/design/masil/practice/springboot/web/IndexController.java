package design.masil.practice.springboot.web;


import design.masil.practice.springboot.config.auth.LoginUser;
import design.masil.practice.springboot.config.auth.dto.SessionUser;
import design.masil.practice.springboot.service.PostsService;
import design.masil.practice.springboot.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;


@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;
//    private final HttpSession httpSession;

/*
    public IndexController(PostsService postsService) {
        this.postsService = postsService;
    }

 */

    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser user) {
        model.addAttribute("posts", postsService.findAllDesc());
        if (user != null) {
            model.addAttribute("userName", user.getName());
        }
        return "index";
    }
/*
    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser user) {
        model.addAttribute("posts", postsService.findAllDesc());
        if (user != null) {
            model.addAttribute("userName", user.getName());
        }
        return "index";
    }

 */



    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model) {
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);
        return "posts-update";
    }


}
