# NOTE: This file is auto generated by OpenAPI Generator 7.8.0-SNAPSHOT (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OpenapiPetstore.Model.Name do
  @moduledoc """
  Model for testing model name same as property name
  """

  @derive Jason.Encoder
  defstruct [
    :name,
    :snake_case,
    :property,
    :"123Number"
  ]

  @type t :: %__MODULE__{
    :name => integer(),
    :snake_case => integer() | nil,
    :property => String.t | nil,
    :"123Number" => integer() | nil
  }

  def decode(value) do
    value
  end
end

