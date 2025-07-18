package com.example.demo.service;

import java.time.Duration;
import java.time.LocalTime;

public class TimeServiceImpl implements TimeService{

	@Override
	public Duration timediff(LocalTime time1, LocalTime time2) {
		
		return Duration.between(time1, time2);
	}

	@Override
	public Duration timediff(LocalTime time1, LocalTime time2, LocalTime time3) {
	    Duration fdiff = Duration.between(time1, time2);
	    Duration sdiff = Duration.between(LocalTime.of(0,0), time3);
	    return fdiff.minus(sdiff);
	}

	@Override
	public Duration timediff(LocalTime time1, LocalTime time2, LocalTime time3, LocalTime time4) {
	    Duration fdiff = Duration.between(time1, time2);
	    Duration sdiff = Duration.between(time3, time4);
	    return fdiff.minus(sdiff);
	}

	
}
