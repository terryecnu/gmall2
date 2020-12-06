package com.java.gmall.index.controller;

import com.java.core.bean.Resp;
import com.java.gmall.index.service.IndexService;
import com.java.gmall.pms.entity.Category;
import com.java.gmall.pms.vo.CategoryVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jiangli
 * @since 2020/1/17 22:17
 */
@RestController
@RequestMapping("/index")
public class IndexController {
	@Autowired
	private IndexService indexService;

	/*@GetMapping("/cates")
	public Resp<List<Category>> queryLevel1Categories() {
		List<Category> categories = indexService.queryLevel1Categories();
		return Resp.ok(categories);
	}*/
	@ApiOperation("根据分类等级或者父id查询分类")
	@GetMapping("/cates")
	public Resp<List<Category>> queryLevel1Categories(){
		return indexService.queryLevel1Categories();
	}

	@GetMapping("/cates/{pid}")
	public Resp<List<Category>> querySubCategory(@PathVariable("pid")Long pid){
		Resp<List<Category>> res = indexService.queryCategoryVO(pid);
		return res;
	}

	@GetMapping("/main")
	public String testMain() throws InterruptedException {
		return indexService.testMain();
	}

	@GetMapping("/sub")
	public String testSub() {
		return indexService.testSub();
	}

    @GetMapping("testlock")
    public Resp<Object> testLock() throws InterruptedException {
        indexService.testLock();

        return Resp.ok(null);
    }

	/**
	 * 等待
	 * @return
	 */
	@GetMapping("latch")
	public Resp<Object> countDownLatch(){

		String msg = indexService.latch();

		return Resp.ok(msg);
	}

	/**
	 * 计数
	 * @return
	 */
	@GetMapping("out")
	public Resp<Object> out(){

		String msg = indexService.countDown();

		return Resp.ok(msg);
	}




}
