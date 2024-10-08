package com.gl.ceir.config.repository.app;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.ceir.config.model.app.GdceCheckImeiReq;

public interface GdceCheckImeiReqRepository extends JpaRepository<GdceCheckImeiReq, Long> {

    public GdceCheckImeiReq save(GdceCheckImeiReq gdceCheckImeiReq);
}
