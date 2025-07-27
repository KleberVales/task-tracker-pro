@Entity
public class NotificationLog {
    @Id
    @GeneratedValue
    private Long id;
    private String destino;
    private String tipo;
    private String status;
    private LocalDateTime enviadoEm;
}
