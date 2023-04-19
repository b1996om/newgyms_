package com.mycompany.newgyms.admin.review.service;

import java.util.List;
import java.util.Map;

import com.mycompany.newgyms.review.vo.ReviewVO;

public interface AdminReviewService {
	public String adminReviewMaxNum(Map condMap) throws Exception;
	public List<ReviewVO> adminReviewList(Map condMap) throws Exception;
	public List<ReviewVO> reviewImageList(Map condMap) throws Exception;
	public void adminReviewDelete(String review_no) throws Exception;
}
