package com.kgc.dao;

import com.kgc.entity.News;

import java.util.Date;

public interface NewsDao {
	//��������Դ��ȡ������Ϣ
	public void getNewsListByDS() ;

	// ��ѯ������Ϣ
	public void getNewsList();

	public void add(int id, int categoryId, String title, String summary,
                    String content, Date createdate);

	public void add2(News news);


}
