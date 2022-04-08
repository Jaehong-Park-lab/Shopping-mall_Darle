package com.example.darles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

  @GetMapping("/admin")
  public String getAdminIndex() {

    return "admin/index";
  }

  @GetMapping("/admin/login")
  public String getAdminLogin() {

    return "admin/login";
  }

  @GetMapping("/admin/tables")
  public String getAdminTables() {

    return "admin/tables";
  }

  @GetMapping("/admin/register")
  public String getAdminRegister() {

    return "admin/register";
  }

  @GetMapping("/admin/pass")
  public String getAdminPassword() {

    return "admin/password";
  }

  @GetMapping("/admin/layout_static")
  public String getAdminLayoutStatic() {

    return "admin/layout-static";
  }

  @GetMapping("/admin/layout_sidenav_light")
  public String getAdminLayoutSidenavLight() {

    return "admin/layout-sidenav-light";
  }

  @GetMapping("/admin/charts")
  public String getAdminCharts() {

    return "admin/charts";
  }

  @GetMapping("/admin/500")
  public String getAdmin500Error() {

    return "admin/500";
  }

  @GetMapping("/admin/404")
  public String getAdmin404Error() {

    return "admin/404";
  }

  @GetMapping("/admin/401")
  public String getAmin401Error() {

    return "admin/401";
  }
}