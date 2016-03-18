public class Easter {
    
    int aYear,aMonth,aDay;
		
		Easter(){
			
		}
		
		Easter(int aYear,int aMonth,int aDay){
			this.aYear = aYear;
			this.aMonth = 0;
			this.aDay = 0;
		}
        public void gauss_algorithm(){
        

    	    int a = this.aYear % 19,
		b = this.aYear / 100,
		c = this.aYear % 100,
		d = b / 4,
		e = b % 4,
		f = (b+8) / 25,
		g = (b-f+1) / 3,
		h = (19*a+b-d-g+15) % 30,
		i = c / 4,
		k = c % 4,
		l = (32+ 2*e + 2*i - h - k) % 7,
		m = (a + 11*h + 22*l) / 451;
                this.aMonth = ((h + l - 7*m + 114) / 31);
		this.aDay = ((h + l - 7*m + 114) % 31)+1;
              
    }     
    @Override
    public String toString() {
        gauss_algorithm();
        return "In " + String.format("%d", this.aYear) + ", Easter Sunday is: month = "+ String.format("%d", this.aMonth) + " and day = " + String.format("%d",this.aDay);
    }
}
