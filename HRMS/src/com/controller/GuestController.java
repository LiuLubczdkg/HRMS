package com.controller;

import com.model.Administer;
import com.model.Guest;
import com.model.Recruitment;
import com.service.GuestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class GuestController {
    @Resource
    private GuestService guestService;
    @RequestMapping(value="/guestlogin")
    public String Guestlogin(){return "guestlogin";}
    @RequestMapping(value="/guestadd")
    public String Guestadd(){return "addguest";}
    @RequestMapping(value = "glogin")
    public String Login(Guest guest, HttpServletRequest request, HttpServletResponse response)throws Exception{
      Guest guest1=guestService.selectGuestbyname(guest);
        if (guest1!=null){
            guestService.addGuest(guest);
            return "admin";
        }
        return "adminlogin";
    }
    @RequestMapping(value = "/addguest")
    public String addguest(Guest guest, HttpServletRequest request){
       Guest guest1=guestService.selectGuestbyname(guest);
        if (null==guest1){
            guestService.addGuest(guest);
            return "guestlogin";
        }
        return "wrong";
    }
}
