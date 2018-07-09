package com.qait.automation.tanuj_sir_test;

public class MyCollection implements DynamicArray{
	
		int arr_len=0;
		int flag_for_array_size=0;
		
		
		 
		
		@SuppressWarnings("unused")
		private int[] numArray;
		/**
		 * It constructs an empty Collection object with an array capacity specified by the integer
			parameter "arraySize".
		 */
		public MyCollection(int arraySize){
			numArray = new int[arraySize];
		}

		public int search(int searchingNum) {
			arr_len=numArray.length;
			int flag=-2;
			for(int i=0;i<=arr_len-1;i++)
			{
				if(numArray[i]==searchingNum)
				{
					flag=i;
				}
				
			}
			if(flag<0)
				return -1;
			else
				return flag;
		}

		public boolean add(int numberToAdd)
		{
			int String_len;
			int flag_for_search=search( numberToAdd);
			if(flag_for_search!=-1)
			{
				return false;
			}
			else
			{
				arr_len=numArray.length;
				if(flag_for_array_size==arr_len)
				{
					doubleCapacity();
					flag_for_array_size++;
					numArray[flag_for_array_size]=numberToAdd;
					return true;
				
				
				}
				else
				{
					numArray[flag_for_array_size]=numberToAdd;
					flag_for_array_size++;
					return true;
					
				}
				
				
				
				
			}
			
			
		}

		public void doubleCapacity() 
		{
			arr_len=numArray.length;
			int muti=2*arr_len;
			int[] new_temp_array = new int[multi];
			for(int i=0;i<flag_for_array_size;i++)
			{
				new_temp_array[i]=numArray[i];
			}
			numArray=new_temp_array;
			
		}

		public boolean remove(int numberToRemove)
		{
			arr_len=numArray.length;
			int flag_for_search=search( numberToRemove);
			if(flag_for_search==-1)
			{
				return false;
			}
			else
			{
				for(int i=0;i<=arr_len-1;i++)
				{
					if(numArray[i]==numberToRemove)
					{
						for(int j=i;j<arr_len;j++)
						{
							numArray[j]=numArray[j+1];
							
						}
						
					}
					
				}
				
				flag_for_array_size--;
				return true;
				
			}
		}

		public int getCount() {
			
			return flag_for_array_size; 
		}

		public int[] rotate(int n) {
			arr_len=numArray.length;
			int num=0;
			int[] new_temp_array = new int[arr_len];
			for(int i=0;i<arr_len;i++)
			{
				num=i+n;
				if(num<=arr_len)
				{
				new_temp_array[i]=numArray[i+2];
				}
				else
				{
					
				}
					
			}
			
			return null;
		}
		

	}
