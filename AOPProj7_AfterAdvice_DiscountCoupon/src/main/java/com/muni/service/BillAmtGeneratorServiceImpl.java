package com.muni.service;

public class BillAmtGeneratorServiceImpl implements BillAmtGenartorService {

	
	public int BillAmtGenerator(String[] items) {
		  int BillAmt =0;
		  //Get The BillAmt
		  BillAmt=items.length*1000;
		  return BillAmt;
		
		}

}
