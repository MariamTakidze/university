package com.solvd.dao.jdbc;

import com.solvd.dao.IMeetingRoomDAO;
import com.solvd.models.MeetingRooms;

import java.sql.SQLException;
import java.util.List;

public class MeetingRoomDAO extends AbstractMySQLDAO implements IMeetingRoomDAO {
    @Override
    public MeetingRooms get(Long id) throws SQLException {
        return null;
    }

    @Override
    public List<MeetingRooms> getAll() throws SQLException {
        return null;
    }

    @Override
    public void save(MeetingRooms meetingRooms) throws SQLException {

    }

    @Override
    public void insert(MeetingRooms meetingRooms) throws SQLException {

    }

    @Override
    public void update(MeetingRooms meetingRooms) throws SQLException {

    }

    @Override
    public void delete(MeetingRooms meetingRooms) throws SQLException {

    }
}
