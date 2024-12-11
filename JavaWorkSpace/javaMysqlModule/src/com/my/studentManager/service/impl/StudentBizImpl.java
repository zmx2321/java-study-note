package com.my.studentManager.service.impl;

import java.util.List;

import com.my.studentManager.dao.StudentDao;
import com.my.studentManager.dao.impl.StudentDaoImpl;
import com.my.studentManager.entity.Student;
import com.my.studentManager.service.StudentBiz;

/**
 * 业务逻辑层
 * 业务逻辑--- 链接底层(dao)
 * @author Administrator
 *
 */
public class StudentBizImpl implements StudentBiz {

	private StudentDao stuDao;

	public StudentBizImpl() {
		stuDao = new StudentDaoImpl();
	}

	public int addStudent(Student student){
		return stuDao.addStudent(student);

	}

	public List<Student> selectAll() {
		return stuDao.selectAll();
	}

	@Override
	public boolean isExistName(String name) {
		return true;
	}

	@Override
	public boolean judgeNameAndPsw(String name, String psw) {
		return true;
	}

}
