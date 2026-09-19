class MyCalendar {
         ArrayList<int[]>Calender=new ArrayList<>();
     
    public boolean book(int startTime, int endTime) {
        for(int [] event:Calender){
            if(startTime<event[1] && endTime>event[0]){
                return false;
            }
        }
        Calender.add(new int []{startTime,endTime});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */
