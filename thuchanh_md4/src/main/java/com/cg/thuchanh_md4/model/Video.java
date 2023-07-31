package com.cg.thuchanh_md4.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Table(name = "video")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String url;
//    @ManyToMany
//    @JoinColumn(name = "playlist_id", referencedColumnName = "id", nullable = false)
//
//    private Playlist playlist;
    @OneToMany(mappedBy = "video",cascade = CascadeType.PERSIST)
    private List<PlaylistDetail> playlistDetails;

}
