package com.site.blog.my.core.service;

import com.site.blog.my.core.domain.BlogTagCount;
import com.site.blog.my.core.common.util.PageQueryUtil;
import com.site.blog.my.core.common.util.PageResult;

import java.util.List;

public interface TagService {

    /**
     * 查询标签的分页数据
     *
     * @param pageUtil
     * @return
     */
    PageResult getBlogTagPage(PageQueryUtil pageUtil);

    int getTotalTags();

    Boolean saveTag(String tagName);

    Boolean deleteBatch(Integer[] ids);

    List<BlogTagCount> getBlogTagCountForIndex();
}
