package org.motest.admin.controller;


import org.motest.admin.entity.TSUser;
import org.motest.admin.service.TSUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * InnoDB free: 587776 kB; (`id`) REFER `jeecg/t_s_base_user`(` 前端控制器
 * </p>
 *
 * @author Terry
 * @since 2018-05-10
 */
@Controller
@RequestMapping("/tSUser")
public class TSUserController {

    @Autowired
    private TSUserService userService;

    @RequestMapping(value = "/getuser/{id}",method = RequestMethod.GET)
    @ResponseBody
    public TSUser getUser(@PathVariable(value = "id") String id){
        TSUser tsUser = userService.selectById(id);
        return tsUser;
    }
}

