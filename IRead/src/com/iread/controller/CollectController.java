package com.iread.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iread.pojoExtend.CommentExtend;
import com.iread.utils.Status;

@Controller
// 窄化请求映射：对url进行分类管理
@RequestMapping("/collect")
public class CollectController {

	@RequestMapping(value = "/getCollectStatus")
	public @ResponseBody
	Status getCollectStatus(String userId, String subjectId) throws Exception {

		Status status = new Status();
		status.setStatus(Status.ok);
		return status;
	}
}
