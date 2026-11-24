package domain;

/**
 * Класс данных об альбоме
 */
public class Album {

    // Идентификатор альбома
    private Long id;

    // Название
    private String title;

    // Год выхода
    private Integer releaseYear;

    // Количество композиций
    private Integer tracksCount;

    // Внешний ключ - ссылка на сущность Musician
    private Long idMusician;

    // Навигационное свойство - ссылка на музыканта
    private Musician musician;

    public Album() {
    }

    public Album(String title, Integer releaseYear, Integer tracksCount, Musician musician) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.tracksCount = tracksCount;
        this.musician = musician;
    }

    public Album(String title, Integer releaseYear, Integer tracksCount,
            Long idMusician, Musician musician) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.tracksCount = tracksCount;
        this.idMusician = idMusician;
        this.musician = musician;
    }

    public Album(Long id, String title, Integer releaseYear, Integer tracksCount,
            Long idMusician, Musician musician) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
        this.tracksCount = tracksCount;
        this.idMusician = idMusician;
        this.musician = musician;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Integer getTracksCount() {
        return tracksCount;
    }

    public void setTracksCount(Integer tracksCount) {
        this.tracksCount = tracksCount;
    }

    public Long getIdMusician() {
        return idMusician;
    }

    public void setIdMusician(Long idMusician) {
        this.idMusician = idMusician;
    }

    public Musician getMusician() {
        return musician;
    }

    public void setMusician(Musician musician) {
        this.musician = musician;
    }

    @Override
    public String toString() {
        return "Album {" + "Id = " + id +
                ", Title = " + title +
                ", ReleaseYear = " + releaseYear +
                ", TracksCount = " + tracksCount +
                ", Musician = " + (musician == null ? null : musician.getPseudonym()) +
                "}";
    }
}
