package ch801

import java.io.*;

public class Main {
	/**
	 * �ֽ�copy
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *����������ö�Ӧ�����������Ϳ����� 
		 */
	}
	public void fileStream(String src, String des){  //src��Դ�ļ�·�������ƣ�des��Ŀ���ļ�·��������
		try{
			FileInputStream in = new FileInputStream(src);
			FileOutputStream out = new FileOutputStream(des);
			byte[] s = new byte[1024];
			long ss = System.currentTimeMillis();
			int len;
			while((len=in.read(s))!=-1){
				out.write(s, 0, len);
			}
			long sss = System.currentTimeMillis();
			System.out.println(sss-ss+"ms");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void fileChar(String src, String des){
		try{
			FileReader fr = new FileReader(src);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(des);
			BufferedWriter bw = new BufferedWriter(fw);
			long ss = System.currentTimeMillis();
			String temp;
			while((temp=br.readLine())!=null){
				bw.write(temp);
				bw.newLine();
			}
			long sss = System.currentTimeMillis();
			System.out.println(sss-ss+"ms");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
