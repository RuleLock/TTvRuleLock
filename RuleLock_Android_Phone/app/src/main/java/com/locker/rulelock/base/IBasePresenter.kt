package com.locker.rulelock.base

/**
 * @description
 * @author fxc
 * @date 17-11-5
 */
interface IBasePresenter {
	fun notifyOnCreate()
	fun notifyOnResume()
	fun notifyOnPause()
	fun notifyOnDestroy()
}