package domain;

import java.time.LocalDate;

/**
 * Класс данных о музыканте
 */
public class Musician {

    // Идентификатор музыканта
    private Long id;

    // ФИО
    private String fullName;

    // Псевдоним
    private String pseudonym;

    // Дата рождения
    private LocalDate birthDate;

    // Страна
    private String country;

    public Musician() {
    }

    public Musician(String fullName, String pseudonym, LocalDate birthDate, String country) {
        this.fullName = fullName;
        this.pseudonym = pseudonym;
        this.birthDate = birthDate;
        this.country = country;
    }

    public Musician(Long id, String fullName, String pseudonym, LocalDate birthDate, String country) {
        this.id = id;
        this.fullName = fullName;
        this.pseudonym = pseudonym;
        this.birthDate = birthDate;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Musician {" + "Id = " + id +
                ", FullName = " + fullName +
                ", Pseudonym = " + pseudonym +
                ", BirthDate = " + birthDate +
                ", Country = " + country +
                "}";
    }
}
