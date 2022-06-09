package model;

import java.util.*;
import java.util.Objects;

public class Artist {
    private final String name;
    private boolean associatedMajorLabels;
    private List<String> majorLabels;

    public Artist(String name, boolean associatedMajorLabels, List<String> majorLabels) {
        this.name = name;
        this.associatedMajorLabels = associatedMajorLabels;
        this.majorLabels = majorLabels;
    }

    public String getName() {
        return name;
    }

    public boolean isAssociatedMajorLabels() {
        return associatedMajorLabels;
    }

    public List<String> getMajorLabels() {
        return majorLabels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Artist other = (Artist) obj;
        return Objects.equals(name, other.name);
    }

    public String toString() {
        return name;
    }
}
