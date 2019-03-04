package com.mmall.service;

import com.mmall.common.ServerResponse;

/**
 * Created by wenbin on 19-2-28.
 */
public interface ICategoryService {
    ServerResponse addCategory(String categoryName, Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId, String categoryName);
}
