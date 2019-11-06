package com.ms.controller;

import com.ms.response.DataGridView;
import com.ms.response.ResultObj;
import com.ms.service.IWorkFlowService;
import com.ms.vo.NoticeVo;
import com.ms.vo.WorkFlowVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @Classname： WorkFlowController
 * @Description：工作流控制器
 * @Author： xiedong
 * @Date： 2019/11/6 16:26
 * @Version： 1.0
 **/
@Controller
@RequestMapping("workflow")
public class WorkFlowController {

    /**
     * 跳转到流程定义管理界面
     */
    @RequestMapping("toWorkFlowDef")
    public String toWorkFlowDef()
    {
        return "workflow/processDefManager";
    }
    /**
     * 跳转到流程部署管理界面
     */
    @RequestMapping("toWorkFlowDeploy")
    public String toWorkFlowDeploy()
    {
        return "workflow/processDeployManager";
    }

}