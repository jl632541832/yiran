package com.yiran.wechat.mapper;

import com.yiran.wechat.domain.WechatProductAndAttribute;
import java.util.List;	

/**
 * 商品与属性关联 数据层
 * 
 * @author yiran
 * @date 2019-06-13
 */
public interface WechatProductAndAttributeMapper 
{
	/**
     * 查询商品与属性关联信息
     * 
     * @param productAndAttributeId 商品与属性关联ID
     * @return 商品与属性关联信息
     */
	public WechatProductAndAttribute selectWechatProductAndAttributeById(Integer productAndAttributeId);
	
	/**
     * 查询商品与属性关联列表
     * 
     * @param wechatProductAndAttribute 商品与属性关联信息
     * @return 商品与属性关联集合
     */
	public List<WechatProductAndAttribute> selectWechatProductAndAttributeList(WechatProductAndAttribute wechatProductAndAttribute);
	
	/**
     * 新增商品与属性关联
     * 
     * @param wechatProductAndAttribute 商品与属性关联信息
     * @return 结果
     */
	public int insertWechatProductAndAttribute(WechatProductAndAttribute wechatProductAndAttribute);
	
	/**
     * 修改商品与属性关联
     * 
     * @param wechatProductAndAttribute 商品与属性关联信息
     * @return 结果
     */
	public int updateWechatProductAndAttribute(WechatProductAndAttribute wechatProductAndAttribute);
	
	/**
     * 删除商品与属性关联
     * 
     * @param productAndAttributeId 商品与属性关联ID
     * @return 结果
     */
	public int deleteWechatProductAndAttributeById(Integer productAndAttributeId);
	
	/**
     * 批量删除商品与属性关联
     * 
     * @param productAndAttributeIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteWechatProductAndAttributeByIds(String[] productAndAttributeIds);
	
}