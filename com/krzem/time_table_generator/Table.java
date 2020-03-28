package com.krzem.time_table_generator;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.Exception;



public class Table{
	public Table(String ifn,String odr){
		this._create(ifn,odr);
	}



	private void _create(String ifn,String odr){
		try{
			File ifo=new File(ifn);
			BufferedReader fo=new BufferedReader(new FileReader(ifo));
			String ln=null;
			int st=0;
			int w=0;
			int h=0;
			int i=0;
			while ((ln=fo.readLine())!=null){
				if (ln.length()==0){
					st++;
					continue;
				}
				if (st==0){
					w=Integer.parseInt(ln.split("x")[0]);
					h=Integer.parseInt(ln.split("x")[1]);
				}
				else if (st==1){
					System.out.println("TEACHER: "+ln);
				}
				else if (st==2){
					System.out.println("STUDENT: "+ln);
				}
				i++;
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}