package model;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Album {
    private String albumName;
    private int albumCost;
    private List<Artist> artists;

    public Album(String name, int albumCost, List<Artist> artists) {
        this.albumName = name;
        this.artists = artists;
        this.albumCost = albumCost;
    }

    public void artistAlbumPairsToMajorLabels(Consumer<Pair<String, String>> consumer) {

        for (Artist artist : artists) {
            if (artist.isAssociatedMajorLabels()) {
                String concatLabels = artist.getMajorLabels()
                        .stream()
                        .collect(Collectors.joining(","));
                consumer.accept(new ImmutablePair<>(artist.getName() + ":" + albumName, concatLabels));
            }
        }
    }

    public String getAlbumName() {
        return albumName;
    }

    public int getAlbumCost() {
        return albumCost;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public String toString() {
        return albumName;
    }
}
