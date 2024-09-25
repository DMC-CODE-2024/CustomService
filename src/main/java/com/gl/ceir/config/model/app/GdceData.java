package com.gl.ceir.config.model.app;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Entity
@Getter

@AllArgsConstructor
@NoArgsConstructor
public class GdceData {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore// not seen in swagger
    private Long id;
    private String imei;
    private String serial_number;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "registration_date")
    private LocalDateTime date_of_registration;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime date_of_actual_import;

    @Transient
    private String goods_description;

    @Transient
    private String customs_duty_tax;

    @JsonIgnore
    private int isCustomTaxPaid;

    @Transient   // not in db
    private String device_type;
    @Transient
    private String brand;
    @Transient
    private String model;
    @Transient
    private int sim;

    private int is_used;

    private String importer_id;

    private String importer_name;

    @JsonIgnore
    private String actual_imei;
    @JsonIgnore
    private String request_id;
    @JsonIgnore
    private String source;

    @Override
    public String toString() {
        return "{" +
                "importer_name='" + importer_name + '\'' +
                ", importer_id='" + importer_id + '\'' +
                ", is_used=" + is_used +
                ", sim=" + sim +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", device_type='" + device_type + '\'' +
                ", customs_duty_tax='" + customs_duty_tax + '\'' +
                ", goods_description='" + goods_description + '\'' +
                ", date_of_actual_import=" + date_of_actual_import +
                ", date_of_registration=" + date_of_registration +
                ", serial_number='" + serial_number + '\'' +
                ", imei='" + imei + '\'' +
                '}';
    }

}
