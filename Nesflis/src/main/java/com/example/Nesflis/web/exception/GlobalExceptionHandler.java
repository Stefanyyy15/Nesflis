// Global exception handler with support for all entities.
package com.example.Nesflis.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handleEntityNotFoundException(EntityNotFoundException ex) {
        ErrorResponses errorResponse = new ErrorResponses("Entidad no encontrada", ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DuplicateEntityException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<Object> handleDuplicateEntityException(DuplicateEntityException ex) {
        ErrorResponses errorResponse = new ErrorResponses("Conflicto de datos", ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(ValidationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<Object> handleValidationException(ValidationException ex) {
        ErrorResponses errorResponse = new ErrorResponses("Datos no válidos", ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(AdministradorNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handleAdministradorNotFoundException(AdministradorNotFoundException ex) {
        ErrorResponses errorResponse = new ErrorResponses("Administrador no encontrado", ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ContenidoNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handleContenidoNotFoundException(ContenidoNotFoundException ex) {
        ErrorResponses errorResponse = new ErrorResponses("Contenido no encontrado", ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(GeneroNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handleGeneroNotFoundException(GeneroNotFoundException ex) {
        ErrorResponses errorResponse = new ErrorResponses("Género no encontrado", ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(PerfilNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handlePerfilNotFoundException(PerfilNotFoundException ex) {
        ErrorResponses errorResponse = new ErrorResponses("Perfil no encontrado", ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(PlanNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handlePlanNotFoundException(PlanNotFoundException ex) {
        ErrorResponses errorResponse = new ErrorResponses("Plan no encontrado", ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(RepartoNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handleRepartoNotFoundException(RepartoNotFoundException ex) {
        ErrorResponses errorResponse = new ErrorResponses("Reparto no encontrado", ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(UsuarioNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handleUsuarioNotFoundException(UsuarioNotFoundException ex) {
        ErrorResponses errorResponse = new ErrorResponses("Usuario no encontrado", ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ValoracionNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handleValoracionNotFoundException(ValoracionNotFoundException ex) {
        ErrorResponses errorResponse = new ErrorResponses("Valoración no encontrada", ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<Object> handleGlobalException(Exception ex) {
        ErrorResponses errorResponse = new ErrorResponses("Error en la aplicación", ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
