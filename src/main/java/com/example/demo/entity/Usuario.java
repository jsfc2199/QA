package com.example.demo.entity;

    import jakarta.persistence.*;
    import lombok.AllArgsConstructor;
    import lombok.Data;
    import lombok.NoArgsConstructor;

    import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity(name = "Usuarios")
@Table(name = "usuarios")
public class Usuario{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String contact;
    private String name;
    private String identification;
    private String phone;
    private String email;
    private float height;
    private int age;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Ticket> listOfTickets;

    public Usuario addTicket(Ticket ticket){
        this.listOfTickets.add(ticket);
        return this;
    }
}
