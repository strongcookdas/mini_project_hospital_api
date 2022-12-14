package com.example.mini_project_hospital_api.parser;

import com.example.mini_project_hospital_api.dao.HospitalDao;
import com.example.mini_project_hospital_api.domain.Hospital;
import com.example.mini_project_hospital_api.service.HospitalService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HospitalParserTest {
//    String line1 = "\"1\",\"의원\",\"01_01_02_P\",\"3620000\",\"PHMA119993620020041100004\",\"19990612\",\"\",\"01\",\"영업/정상\",\"13\",\"영업중\",\"\",\"\",\"\",\"\",\"062-515-2875\",\"\",\"500881\",\"광주광역시 북구 풍향동 565번지 4호 3층\",\"광주광역시 북구 동문대로 24, 3층 (풍향동)\",\"61205\",\"효치과의원\",\"20211115113642\",\"U\",\"2021-11-17 02:40:00.0\",\"치과의원\",\"192630.735112\",\"185314.617632\",\"치과의원\",\"1\",\"0\",\"0\",\"52.29\",\"401\",\"치과\",\"\",\"\",\"\",\"0\",\"0\",\"\",\"\",\"0\",\"\",";
//
//    @Autowired
//    ReadLineContext<Hospital> hospitalReadLineContext;
//
//    @Autowired
//    HospitalDao hospitalDao;
//
//    @Autowired
//    HospitalService hospitalService;
//
//    @Test
//    @DisplayName("add,get이 잘 되는지")
//    void addAndGet() {
//        hospitalDao.deleteAll();
//        assertEquals(0, hospitalDao.getCount());
//        HospitalParser hp = new HospitalParser();
//        Hospital hospital = hp.parse(line1);
//        hospitalDao.add(hospital);
//        assertEquals(1, hospitalDao.getCount());
//
//        Hospital seletion = hospitalDao.findeById(hospital.getId());
//        assertEquals(hospital.getId(), seletion.getId());
//        assertEquals(hospital.getOpenServiceName(), seletion.getOpenServiceName());
//        assertEquals(hospital.getOpenLocalGovernmentCode(), seletion.getOpenLocalGovernmentCode());
//        assertEquals(hospital.getManagementNumber(), seletion.getManagementNumber());
//        assertTrue(seletion.getLicenseDate().isEqual(hospital.getLicenseDate()));
//        assertEquals(hospital.getBusinessStatus(), seletion.getBusinessStatus());
//        assertEquals(hospital.getBusinessStatusCode(), seletion.getBusinessStatusCode());
//        assertEquals(hospital.getPhone(), seletion.getPhone());
//        assertEquals(hospital.getFullAddress(), seletion.getFullAddress());
//        assertEquals(hospital.getRoadNameAddress(), seletion.getRoadNameAddress());
//        assertEquals(hospital.getHospitalName(), seletion.getHospitalName());
//        assertEquals(hospital.getBusinessTypeName(), seletion.getBusinessTypeName());
//        assertEquals(hospital.getHealthcareProviderCount(), seletion.getHealthcareProviderCount());
//        assertEquals(hospital.getPatientRoomCount(), seletion.getPatientRoomCount());
//        assertEquals(hospital.getTotalNumberOfBeds(), seletion.getTotalNumberOfBeds());
//        assertEquals(hospital.getTotalAreaSize(), seletion.getTotalAreaSize());
//
//    }
//
//    @Test
//    @DisplayName("10만건 이상 데이터가 파싱 되는지")
//    void oneHundreadThousandRows() throws IOException {
//        // 서버환경에서 build할 때 문제가 생길 수 있습니다.
//        // 어디에서든지 실행할 수 있게 짜는 것이 목표.
//        String filename = "hospital.csv";
//        hospitalDao.deleteAll();
//        int cnt = hospitalService.insertLargeVolumeHospitalData(filename);
//        assertTrue(cnt > 1000);
//        assertTrue(cnt > 10000);
//        System.out.printf("파싱된 데이터 개수:", cnt);
//    }
//
//
//    @Test
//    @DisplayName("csv 1줄을 잘만드는지 test")
//    void convertToHospital() {
//        HospitalParser hp = new HospitalParser();
//        Hospital hospital = hp.parse(line1);
//        assertEquals(1, hospital.getId());
//        assertEquals("의원", hospital.getOpenServiceName());
//        assertEquals(3620000, hospital.getOpenLocalGovernmentCode());
//        assertEquals("PHMA119993620020041100004", hospital.getManagementNumber());
//        assertEquals(LocalDateTime.of(1999, 6, 12, 0, 0, 0), hospital.getLicenseDate()); //19990612
//        assertEquals(1, hospital.getBusinessStatus());
//        assertEquals(13, hospital.getBusinessStatusCode());
//        assertEquals("062-515-2875", hospital.getPhone());
//        assertEquals("광주광역시 북구 풍향동 565번지 4호 3층", hospital.getFullAddress());
//        assertEquals("광주광역시 북구 동문대로 24, 3층 (풍향동)", hospital.getRoadNameAddress());
//        assertEquals("효치과의원", hospital.getHospitalName());
//        assertEquals("치과의원", hospital.getBusinessTypeName());
//        assertEquals(1, hospital.getHealthcareProviderCount());
//        assertEquals(0, hospital.getPatientRoomCount());
//        assertEquals(0, hospital.getTotalNumberOfBeds());
//        assertEquals(52.29f, hospital.getTotalAreaSize());
//    }

}