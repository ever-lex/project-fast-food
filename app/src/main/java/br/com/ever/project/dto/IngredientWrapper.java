package br.com.ever.project.dto;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class IngredientWrapper implements Serializable{

	private static final long serialVersionUID = 1L;

	private List<Ingredient> ingredients;
}
