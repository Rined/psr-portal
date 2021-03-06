package com.rined.psr.portal.repositories;

import com.rined.psr.portal.model.Volunteer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VolunteerRepository extends BaseRepository<Volunteer, Long> {

    boolean existsByPhone(String phone);

    boolean existsByTelegramLogin(String telegramLogin);

    @Query("SELECT v.chatId FROM volunteer v WHERE v.id IN :ids")
    List<Long> findVolunteersChatIdsByIdIn(@Param("ids") List<Long> ids);

    @Query("SELECT v.id FROM volunteer v WHERE v.telegramLogin=:login")
    Long getVolunteerIdByLogin(@Param("login") String login);

}
