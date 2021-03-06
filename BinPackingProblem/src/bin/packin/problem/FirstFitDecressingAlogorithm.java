package bin.packin.problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstFitDecressingAlogorithm {

		private List<Bin> bins;
		private List<Integer> items;
		private int binCapacity;
		private int binCounter=1;
		
		public FirstFitDecressingAlogorithm(List<Integer> items,int binCapacity)
		{
			this.items=items;
			this.binCapacity=binCapacity;
			this.bins=new ArrayList<Bin>();
		}
		public void solveBinPackingProblen()
		{
			Collections.sort(items,Collections.reverseOrder());
			if(this.items.get(0)>binCapacity)
			{
				System.out.println("No Feasible solution...");
				return;
			}
			this.bins.add(new Bin(binCapacity,binCounter));
			for(Integer item:items)
			{
				boolean isOk=false;
				int currentBin=0;
				for(currentBin=0;currentBin<bins.size();currentBin++) {
				if(this.bins.get(currentBin).put(item))
				{	
					isOk=true;
					break;
				}
				}
				if(!isOk) {
				this.bins.add(new Bin(binCapacity,++binCounter));
				this.bins.get(currentBin).put(item);
				}
				
				
			}
			for(int i=0;i<bins.size();i++)
			{
				System.out.println(bins.get(i));
			}
			
			
		}
}
