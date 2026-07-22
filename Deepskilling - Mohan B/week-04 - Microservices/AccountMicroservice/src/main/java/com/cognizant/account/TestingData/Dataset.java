package com.cognizant.account.TestingData;

import java.util.ArrayList;
import java.util.List;

import com.cognizant.account.Entity.Account;
import com.cognizant.account.Entity.Type;

public class Dataset {
	public static List<Account> generateRecords(){
			List<Account> record = new ArrayList<>();
			record.add(mock(987987973432L, Type.savings, 234666.00));
			record.add(mock(445566778899L, Type.current, 345000.75));
			record.add(mock(776655443322L, Type.savings, 1250.00));
			record.add(mock(334455667788L, Type.savings, 98450.10));
			record.add(mock(665544332211L, Type.current, 5400.00));
			return record;
	}
	public static Account mock(long ac_number, Type ac_type, double ac_balance) {
		return  Account.builder()
                .number(ac_number)            
                .type(ac_type)       
                .balance(ac_balance)
              .build();
	}
}
