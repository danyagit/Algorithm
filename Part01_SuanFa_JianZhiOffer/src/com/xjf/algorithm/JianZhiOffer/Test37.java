package com.xjf.algorithm.JianZhiOffer;

//���л�������
//��ʵ�������������ֱ��������л��ͷ����л�������

//�����������л���ָ����һ�ö���������ĳ�ֱ�����ʽ�Ľ����ĳ�ָ�ʽ����Ϊ�ַ�����
//�Ӷ�ʹ���ڴ��н��������Ķ��������Գ־ñ��档
//���л����Ի����������򡢺��򡢲���Ķ�����������ʽ�������޸ģ�
//���л��Ľ����һ���ַ��������л�ʱͨ�� ĳ�ַ��ű�ʾ�սڵ㣨#����
//�� �� ��ʾһ�����ֵ�Ľ�����value!����

//�������ķ����л���ָ������ĳ�ֱ���˳��õ������л��ַ������str���ع���������

//���磬���ǿ��԰�һ��ֻ�и��ڵ�Ϊ1�Ķ��������л�Ϊ"1,"��Ȼ��ͨ���Լ��ĺ��������������������

public class Test37 {

	public static void main(String[] args) {

	}
	
	//���ն�������ǰ������ͻ�������
	String Serialize(TreeNode root) {
		if (root == null)
			return "#,";
		String res = "";
		res += root.val + ","; // ����ǰ���������-��-��
		res += Serialize(root.left);
		res += Serialize(root.right);
		return res;
	}
	// �����л�
	int start = -1;

	TreeNode Deserialize(String str) {
		if (str == null || str.length() == 0)
			return null;
		String[] strArr = str.split(",");//����,��ϳ��ַ�����
		return Deserialize(strArr);
	}

	TreeNode Deserialize(String[] strArr) {
		start++;//����и�ȫ�ֱ���
		if (start >= strArr.length || strArr[start].equals("#"))
			return null;
		TreeNode cur = new TreeNode(Integer.valueOf(strArr[start]));
		cur.left = Deserialize(strArr);//��Ϊǰ���и�ȫ�ֱ���start,��������ط��ݹ��������滹�������������
		cur.right = Deserialize(strArr);
		return cur;
	}

}
