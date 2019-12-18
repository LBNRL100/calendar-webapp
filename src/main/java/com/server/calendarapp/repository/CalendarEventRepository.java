package com.server.calendarapp.repository;

import com.server.calendarapp.pojo.dbo.CalendarEvent;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@EnableScan
@Repository
public interface CalendarEventRepository extends CrudRepository<CalendarEvent, Integer> {

    Optional<List<CalendarEvent>> findByUserID(String userID);

}
