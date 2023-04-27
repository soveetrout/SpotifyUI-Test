package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UITest {
    ChromeDriver driver = new ChromeDriver();

    @Test
    public void UITest() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver.get("https://open.spotify.com/");
        driver.manage().window().maximize();

        SpotifyPageObject spo=new SpotifyPageObject(driver);

        spo.login();
        spo.createPlaylist();
        spo.editPlaylistDetails();
        spo.searchSong("Ram Siya Ram");
        spo.addSongToPlaylist();
        spo.playSong();
        spo.pauseSong();
        spo.removeSongFromPlaylist();
        spo.deletePlaylist();
        driver.manage().deleteAllCookies();
    }
}
