/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ameya
 */
public class TestCases {

    // Each method takes VitalSign object as input and has hardcoded values for each age group
    void NewbornTestCase(VitalSigns vitalsigns) {
        vitalsigns.setAge((float) 0.1);
        vitalsigns.setRespRate(40);
        vitalsigns.setHeartRate(145);
        vitalsigns.setBldPressure(60);
        vitalsigns.setWgtKg(2.5);
        vitalsigns.setWgtLbs(vitalsigns.wgtKg * 2.20462);
    }

    void InfantTestCase(VitalSigns vitalsigns) {
        vitalsigns.setAge((float) 0.9);
        vitalsigns.setRespRate(5);
        vitalsigns.setHeartRate(100);
        vitalsigns.setBldPressure(90);
        vitalsigns.setWgtKg(7);
        vitalsigns.setWgtLbs(vitalsigns.wgtKg * 2.20462);
    }

    void TodderTestCase(VitalSigns vitalsigns) {
        vitalsigns.setAge((float) 2);
        vitalsigns.setRespRate(25);
        vitalsigns.setHeartRate(100);
        vitalsigns.setBldPressure(95);
        vitalsigns.setWgtKg(12);
        vitalsigns.setWgtLbs(vitalsigns.wgtKg * 2.20462); 
    }

    void PreschoolerTestCase(VitalSigns vitalsigns) {
        vitalsigns.setAge((float) 4);
        vitalsigns.setRespRate(25);
        vitalsigns.setHeartRate(10);
        vitalsigns.setBldPressure(95);
        vitalsigns.setWgtKg(16);
        vitalsigns.setWgtLbs(vitalsigns.wgtKg * 2.20462);
    }

    void SchoolTestCase(VitalSigns vitalsigns) {
        vitalsigns.setAge((float) 8);
        vitalsigns.setRespRate(25);
        vitalsigns.setHeartRate(100);
        vitalsigns.setBldPressure(100);
        vitalsigns.setWgtKg(30);
        vitalsigns.setWgtLbs(vitalsigns.wgtKg * 2.20462);
    }

    void AdolescentTestCase(VitalSigns vitalsigns) {
        vitalsigns.setAge((float) 20);
        vitalsigns.setRespRate(15);
        vitalsigns.setHeartRate(70);
        vitalsigns.setBldPressure(15);
        vitalsigns.setWgtKg(60);
        vitalsigns.setWgtLbs(vitalsigns.wgtKg * 2.20462);
    }
}
