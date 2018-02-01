package com.controller;

import com.model.Administer;
import com.model.Guest;
import com.model.Recruitment;
import com.model.Resume;
import com.service.GuestService;
import com.service.ResumeService;
import com.util.MyUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class GuestController {
    @Resource
    private GuestService guestService;
    @Resource
    private ResumeService resumeService;
    @RequestMapping(value="/guestlogin")
    public String Guestlogin(){return "guestlogin";}
    @RequestMapping(value="/guestadd")
    public String Guestadd(){return "addguest";}
    @RequestMapping(value = "glogin")
    public String GLogin(Guest guest, HttpServletRequest request, HttpServletResponse response,HttpSession session)throws Exception{
        System.out.println(guest);
        Guest guest1=guestService.selectGuest(guest);
        System.out.println(guest1);
        Resume re = new Resume();
        re.setGuest(guest1);
        Resume resume=resumeService.MyResume(re);
        if (null!=guest1){
            session.setAttribute("myres",resume);
            session.setAttribute("guest",guest1);
            return "guest";
        }
        return "guest";
    }
    @RequestMapping(value = "/addguest")
    public String addguest(Guest guest, HttpServletRequest request){
       Guest guest1=guestService.selectGuestbyname(guest);
        if (null!=guest1){
            guestService.addGuest(guest);
            return "guest";
        }
        return "wrong";
    }
    @RequestMapping(value = "/updateguest")
    public String updateguest(@RequestParam(value = "newPass")String newPass, @RequestParam(value = "oldPass")String oldPass, HttpServletRequest request,HttpSession session){
        Guest guest= (Guest) session.getAttribute("guest");
        if (guest.getPassword().equals(oldPass)){
            guest.setPassword(oldPass);
            guestService.updateGuest(guest);

            return "guestlogin";
        }
        return "wrong";
    }
}
