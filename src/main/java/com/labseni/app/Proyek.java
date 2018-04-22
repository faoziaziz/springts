package com.labseni.app.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Proyek implements Serializable{
	private static final long serialVersionUID = 3678107792576131001L;
	private String proyekId;
	public String name;
	private BigDecimal unitPrice;
	private String deskripsi;
	private String manufaktur;
	private String kategori;
	private long unitsInStock;
	private long unitsInOrder;
	private boolean discontinued;
	private String condition;
	
	public Proyek(){
		super();
		String name ="Astaga";
	}
	
	public Proyek(String proyekId, String name, BigDecimal unitPrice)
	{
		this.proyekId=proyekId;
		this.name=name;
		this.unitPrice=unitPrice;
	}
	public void setDeskripsi(String deskripsi)
	{
		this.deskripsi=deskripsi;
		//return this;
	}
	public void setKategori(String kategori)
	{
		this.kategori=kategori;
		//return this;
	}
	public void setManufaktur(String manufaktur)
	{
		this.manufaktur=manufaktur;
		//return this;
	}

	@Override
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}

		if (obj==null){
			return false;
		}

		if(getClass()!=obj.getClass()){
			return false;
		}

		Proyek lainnya = (Proyek) obj;
		if (proyekId==null){
			if (lainnya.proyekId!=null)
			{
				return false;
			}
		}
		else if(!proyekId.equals(lainnya.proyekId))
		{
			return false;
		}
		return true;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result=1;
		result=prime*result +((proyekId==null)?0:proyekId.hashCode());
		return result;
	}
}