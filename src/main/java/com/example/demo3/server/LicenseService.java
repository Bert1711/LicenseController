package com.example.demo3.server;

import com.example.demo3.model.License;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class LicenseService {
    public License getLicennse(String licenseId, String organizationId) {
        License license = new License();
        license.setId(new Random().nextInt(1000));
        license.setLicenseId(licenseId);
        license.setOrganizationId(organizationId);
        license.setDescription("Программный продукт");
        license.setProductName("ZRN");
        license.setLicenseType("full");

        return license;
    }
    /**
     * getLicense(String licenseId, String organizationId)
     * - метод, который создает новый объект License,
     * заполняет его поля значениями, переданными в качестве параметров,
     * и возвращает этот объект. В данном методе также используется объект Random(),
     * чтобы присвоить случайный идентификатор (id) объекту License.
     */



    public String createLicense(License license, String organizationId) {
        String responseMessage = null;
        if (license != null) {
            license.setOrganizationId(organizationId);
            responseMessage = String.format(
                    "This is the post and the object is: %s", license.toString());
        }
        return responseMessage;
    }
    /**
     * createLicense(License license, String organizationId)
     * - метод, который принимает на вход объект License и идентификатор организации,
     * а затем устанавливает идентификатор организации в объекте License и возвращает строку,
     * содержащую информацию о созданном объекте License.
     */




    public String updateLicense(License license, String organizationId) {
        String responseMessage = null;
        if (license != null) {
            license.setOrganizationId(organizationId);
            responseMessage = String.format(
                    "This is the put and the object is: %s", license.toString());
        }
        return responseMessage;
    }
    /**
     * updateLicense(License license, String organizationId)
     * - метод, который принимает на вход объект License и идентификатор организации,
     * а затем устанавливает идентификатор организации в объекте License и возвращает строку,
     * содержащую информацию об обновленном объекте License.
     */



    public String deleteLicense(String licenseId, String organizationId) {
        String responseMessage = null;
        responseMessage = String.format(
                "Deleting license with id %s for the organization %s",
                licenseId, organizationId);
        return responseMessage;
    }
    /**
     * deleteLicense(String licenseId, String organizationId)
     * - метод, который принимает на вход идентификатор лицензии и идентификатор организации,
     * а затем возвращает строку, содержащую информацию о том, что объект License был удален из системы.
     * В данном методе не происходит удаление объекта из системы, а только выводится сообщение об удалении.
     */
}
