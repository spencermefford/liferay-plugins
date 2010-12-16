/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.opensocial.service.persistence;

import com.liferay.opensocial.model.OAuthToken;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the o auth token service. This utility wraps {@link OAuthTokenPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OAuthTokenPersistence
 * @see OAuthTokenPersistenceImpl
 * @generated
 */
public class OAuthTokenUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(OAuthToken oAuthToken) {
		getPersistence().clearCache(oAuthToken);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OAuthToken> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OAuthToken> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OAuthToken> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static OAuthToken remove(OAuthToken oAuthToken)
		throws SystemException {
		return getPersistence().remove(oAuthToken);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static OAuthToken update(OAuthToken oAuthToken, boolean merge)
		throws SystemException {
		return getPersistence().update(oAuthToken, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static OAuthToken update(OAuthToken oAuthToken, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(oAuthToken, merge, serviceContext);
	}

	/**
	* Caches the o auth token in the entity cache if it is enabled.
	*
	* @param oAuthToken the o auth token to cache
	*/
	public static void cacheResult(
		com.liferay.opensocial.model.OAuthToken oAuthToken) {
		getPersistence().cacheResult(oAuthToken);
	}

	/**
	* Caches the o auth tokens in the entity cache if it is enabled.
	*
	* @param oAuthTokens the o auth tokens to cache
	*/
	public static void cacheResult(
		java.util.List<com.liferay.opensocial.model.OAuthToken> oAuthTokens) {
		getPersistence().cacheResult(oAuthTokens);
	}

	/**
	* Creates a new o auth token with the primary key. Does not add the o auth token to the database.
	*
	* @param oauthTokenId the primary key for the new o auth token
	* @return the new o auth token
	*/
	public static com.liferay.opensocial.model.OAuthToken create(
		long oauthTokenId) {
		return getPersistence().create(oauthTokenId);
	}

	/**
	* Removes the o auth token with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param oauthTokenId the primary key of the o auth token to remove
	* @return the o auth token that was removed
	* @throws com.liferay.opensocial.NoSuchOAuthTokenException if a o auth token with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.opensocial.model.OAuthToken remove(
		long oauthTokenId)
		throws com.liferay.opensocial.NoSuchOAuthTokenException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(oauthTokenId);
	}

	public static com.liferay.opensocial.model.OAuthToken updateImpl(
		com.liferay.opensocial.model.OAuthToken oAuthToken, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(oAuthToken, merge);
	}

	/**
	* Finds the o auth token with the primary key or throws a {@link com.liferay.opensocial.NoSuchOAuthTokenException} if it could not be found.
	*
	* @param oauthTokenId the primary key of the o auth token to find
	* @return the o auth token
	* @throws com.liferay.opensocial.NoSuchOAuthTokenException if a o auth token with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.opensocial.model.OAuthToken findByPrimaryKey(
		long oauthTokenId)
		throws com.liferay.opensocial.NoSuchOAuthTokenException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(oauthTokenId);
	}

	/**
	* Finds the o auth token with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param oauthTokenId the primary key of the o auth token to find
	* @return the o auth token, or <code>null</code> if a o auth token with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.opensocial.model.OAuthToken fetchByPrimaryKey(
		long oauthTokenId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(oauthTokenId);
	}

	/**
	* Finds all the o auth tokens where gadgetId = &#63; and serviceName = &#63;.
	*
	* @param gadgetId the gadget id to search with
	* @param serviceName the service name to search with
	* @return the matching o auth tokens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.opensocial.model.OAuthToken> findByG_S(
		long gadgetId, java.lang.String serviceName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_S(gadgetId, serviceName);
	}

	/**
	* Finds a range of all the o auth tokens where gadgetId = &#63; and serviceName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param gadgetId the gadget id to search with
	* @param serviceName the service name to search with
	* @param start the lower bound of the range of o auth tokens to return
	* @param end the upper bound of the range of o auth tokens to return (not inclusive)
	* @return the range of matching o auth tokens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.opensocial.model.OAuthToken> findByG_S(
		long gadgetId, java.lang.String serviceName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_S(gadgetId, serviceName, start, end);
	}

	/**
	* Finds an ordered range of all the o auth tokens where gadgetId = &#63; and serviceName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param gadgetId the gadget id to search with
	* @param serviceName the service name to search with
	* @param start the lower bound of the range of o auth tokens to return
	* @param end the upper bound of the range of o auth tokens to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching o auth tokens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.opensocial.model.OAuthToken> findByG_S(
		long gadgetId, java.lang.String serviceName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_S(gadgetId, serviceName, start, end,
			orderByComparator);
	}

	/**
	* Finds the first o auth token in the ordered set where gadgetId = &#63; and serviceName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param gadgetId the gadget id to search with
	* @param serviceName the service name to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching o auth token
	* @throws com.liferay.opensocial.NoSuchOAuthTokenException if a matching o auth token could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.opensocial.model.OAuthToken findByG_S_First(
		long gadgetId, java.lang.String serviceName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.opensocial.NoSuchOAuthTokenException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_S_First(gadgetId, serviceName, orderByComparator);
	}

	/**
	* Finds the last o auth token in the ordered set where gadgetId = &#63; and serviceName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param gadgetId the gadget id to search with
	* @param serviceName the service name to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching o auth token
	* @throws com.liferay.opensocial.NoSuchOAuthTokenException if a matching o auth token could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.opensocial.model.OAuthToken findByG_S_Last(
		long gadgetId, java.lang.String serviceName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.opensocial.NoSuchOAuthTokenException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_S_Last(gadgetId, serviceName, orderByComparator);
	}

	/**
	* Finds the o auth tokens before and after the current o auth token in the ordered set where gadgetId = &#63; and serviceName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param oauthTokenId the primary key of the current o auth token
	* @param gadgetId the gadget id to search with
	* @param serviceName the service name to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next o auth token
	* @throws com.liferay.opensocial.NoSuchOAuthTokenException if a o auth token with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.opensocial.model.OAuthToken[] findByG_S_PrevAndNext(
		long oauthTokenId, long gadgetId, java.lang.String serviceName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.opensocial.NoSuchOAuthTokenException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_S_PrevAndNext(oauthTokenId, gadgetId, serviceName,
			orderByComparator);
	}

	/**
	* Finds the o auth token where userId = &#63; and gadgetId = &#63; and serviceName = &#63; and moduleId = &#63; and tokenName = &#63; or throws a {@link com.liferay.opensocial.NoSuchOAuthTokenException} if it could not be found.
	*
	* @param userId the user id to search with
	* @param gadgetId the gadget id to search with
	* @param serviceName the service name to search with
	* @param moduleId the module id to search with
	* @param tokenName the token name to search with
	* @return the matching o auth token
	* @throws com.liferay.opensocial.NoSuchOAuthTokenException if a matching o auth token could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.opensocial.model.OAuthToken findByU_G_S_M_T(
		long userId, long gadgetId, java.lang.String serviceName,
		long moduleId, java.lang.String tokenName)
		throws com.liferay.opensocial.NoSuchOAuthTokenException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByU_G_S_M_T(userId, gadgetId, serviceName, moduleId,
			tokenName);
	}

	/**
	* Finds the o auth token where userId = &#63; and gadgetId = &#63; and serviceName = &#63; and moduleId = &#63; and tokenName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user id to search with
	* @param gadgetId the gadget id to search with
	* @param serviceName the service name to search with
	* @param moduleId the module id to search with
	* @param tokenName the token name to search with
	* @return the matching o auth token, or <code>null</code> if a matching o auth token could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.opensocial.model.OAuthToken fetchByU_G_S_M_T(
		long userId, long gadgetId, java.lang.String serviceName,
		long moduleId, java.lang.String tokenName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByU_G_S_M_T(userId, gadgetId, serviceName, moduleId,
			tokenName);
	}

	/**
	* Finds the o auth token where userId = &#63; and gadgetId = &#63; and serviceName = &#63; and moduleId = &#63; and tokenName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user id to search with
	* @param gadgetId the gadget id to search with
	* @param serviceName the service name to search with
	* @param moduleId the module id to search with
	* @param tokenName the token name to search with
	* @return the matching o auth token, or <code>null</code> if a matching o auth token could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.opensocial.model.OAuthToken fetchByU_G_S_M_T(
		long userId, long gadgetId, java.lang.String serviceName,
		long moduleId, java.lang.String tokenName, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByU_G_S_M_T(userId, gadgetId, serviceName, moduleId,
			tokenName, retrieveFromCache);
	}

	/**
	* Finds all the o auth tokens.
	*
	* @return the o auth tokens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.opensocial.model.OAuthToken> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the o auth tokens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of o auth tokens to return
	* @param end the upper bound of the range of o auth tokens to return (not inclusive)
	* @return the range of o auth tokens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.opensocial.model.OAuthToken> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the o auth tokens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of o auth tokens to return
	* @param end the upper bound of the range of o auth tokens to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of o auth tokens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.opensocial.model.OAuthToken> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the o auth tokens where gadgetId = &#63; and serviceName = &#63; from the database.
	*
	* @param gadgetId the gadget id to search with
	* @param serviceName the service name to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_S(long gadgetId, java.lang.String serviceName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_S(gadgetId, serviceName);
	}

	/**
	* Removes the o auth token where userId = &#63; and gadgetId = &#63; and serviceName = &#63; and moduleId = &#63; and tokenName = &#63; from the database.
	*
	* @param userId the user id to search with
	* @param gadgetId the gadget id to search with
	* @param serviceName the service name to search with
	* @param moduleId the module id to search with
	* @param tokenName the token name to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByU_G_S_M_T(long userId, long gadgetId,
		java.lang.String serviceName, long moduleId, java.lang.String tokenName)
		throws com.liferay.opensocial.NoSuchOAuthTokenException,
			com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByU_G_S_M_T(userId, gadgetId, serviceName, moduleId,
			tokenName);
	}

	/**
	* Removes all the o auth tokens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the o auth tokens where gadgetId = &#63; and serviceName = &#63;.
	*
	* @param gadgetId the gadget id to search with
	* @param serviceName the service name to search with
	* @return the number of matching o auth tokens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_S(long gadgetId, java.lang.String serviceName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_S(gadgetId, serviceName);
	}

	/**
	* Counts all the o auth tokens where userId = &#63; and gadgetId = &#63; and serviceName = &#63; and moduleId = &#63; and tokenName = &#63;.
	*
	* @param userId the user id to search with
	* @param gadgetId the gadget id to search with
	* @param serviceName the service name to search with
	* @param moduleId the module id to search with
	* @param tokenName the token name to search with
	* @return the number of matching o auth tokens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByU_G_S_M_T(long userId, long gadgetId,
		java.lang.String serviceName, long moduleId, java.lang.String tokenName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByU_G_S_M_T(userId, gadgetId, serviceName, moduleId,
			tokenName);
	}

	/**
	* Counts all the o auth tokens.
	*
	* @return the number of o auth tokens
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static OAuthTokenPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (OAuthTokenPersistence)PortletBeanLocatorUtil.locate(com.liferay.opensocial.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					OAuthTokenPersistence.class.getName());

			ReferenceRegistry.registerReference(OAuthTokenUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(OAuthTokenPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(OAuthTokenUtil.class, "_persistence");
	}

	private static OAuthTokenPersistence _persistence;
}