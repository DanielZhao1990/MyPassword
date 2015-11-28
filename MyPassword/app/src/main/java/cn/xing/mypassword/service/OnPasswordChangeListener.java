package cn.xing.mypassword.service;

import cn.xing.mypassword.model.Password;

/**
 * ����仯������
 * 
 * @author zengdexing
 * 
 */
public interface OnPasswordChangeListener {
	/**
	 * �û��������µ�����
	 */
	public void onNewPassword(Password password);

	/**
	 * ���뱻ɾ����
	 */
	public void onDeletePassword(int id);

	/**
	 * ��������Է����仯��
	 */
	public void onUpdatePassword(Password password);
}
