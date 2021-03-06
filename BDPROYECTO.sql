PGDMP                      	    x         
   dbproyecto    13.0    13.0     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16394 
   dbproyecto    DATABASE     j   CREATE DATABASE dbproyecto WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Spanish_Guatemala.1252';
    DROP DATABASE dbproyecto;
                postgres    false            �            1259    16395    cliente    TABLE       CREATE TABLE public.cliente (
    id_cliente integer NOT NULL,
    nombrecliente character varying(75) NOT NULL,
    numtel integer,
    correo character varying(75) NOT NULL,
    empresa character varying(75) NOT NULL,
    direccion character varying(75) NOT NULL
);
    DROP TABLE public.cliente;
       public         heap    postgres    false            �            1259    16400    desarrolladores    TABLE     �   CREATE TABLE public.desarrolladores (
    id_desarrollador integer NOT NULL,
    nombredesarrollador character varying(75) NOT NULL,
    puesto character varying(75) NOT NULL,
    numtel integer,
    correo character varying(75) NOT NULL
);
 #   DROP TABLE public.desarrolladores;
       public         heap    postgres    false            �            1259    16405    fases    TABLE     k   CREATE TABLE public.fases (
    id_fase integer NOT NULL,
    nombrefase character varying(75) NOT NULL
);
    DROP TABLE public.fases;
       public         heap    postgres    false            �            1259    16451    metodologia    TABLE     �   CREATE TABLE public.metodologia (
    id_metodologia integer NOT NULL,
    nombremetodologia character varying(75) NOT NULL,
    numfase integer NOT NULL
);
    DROP TABLE public.metodologia;
       public         heap    postgres    false            �            1259    24602    proyecto    TABLE     
  CREATE TABLE public.proyecto (
    id_proyecto integer NOT NULL,
    nombreproyecto character varying(75) NOT NULL,
    tiempo character varying(75) NOT NULL,
    costo integer NOT NULL,
    requisitos character varying(300) NOT NULL,
    avance integer NOT NULL
);
    DROP TABLE public.proyecto;
       public         heap    postgres    false            �          0    16395    cliente 
   TABLE DATA           `   COPY public.cliente (id_cliente, nombrecliente, numtel, correo, empresa, direccion) FROM stdin;
    public          postgres    false    200   3       �          0    16400    desarrolladores 
   TABLE DATA           h   COPY public.desarrolladores (id_desarrollador, nombredesarrollador, puesto, numtel, correo) FROM stdin;
    public          postgres    false    201   �       �          0    16405    fases 
   TABLE DATA           4   COPY public.fases (id_fase, nombrefase) FROM stdin;
    public          postgres    false    202   �       �          0    16451    metodologia 
   TABLE DATA           Q   COPY public.metodologia (id_metodologia, nombremetodologia, numfase) FROM stdin;
    public          postgres    false    203   �       �          0    24602    proyecto 
   TABLE DATA           b   COPY public.proyecto (id_proyecto, nombreproyecto, tiempo, costo, requisitos, avance) FROM stdin;
    public          postgres    false    204   ,       1           2606    16399    cliente cliente_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (id_cliente);
 >   ALTER TABLE ONLY public.cliente DROP CONSTRAINT cliente_pkey;
       public            postgres    false    200            3           2606    16404 $   desarrolladores desarrolladores_pkey 
   CONSTRAINT     p   ALTER TABLE ONLY public.desarrolladores
    ADD CONSTRAINT desarrolladores_pkey PRIMARY KEY (id_desarrollador);
 N   ALTER TABLE ONLY public.desarrolladores DROP CONSTRAINT desarrolladores_pkey;
       public            postgres    false    201            5           2606    16409    fases fases_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.fases
    ADD CONSTRAINT fases_pkey PRIMARY KEY (id_fase);
 :   ALTER TABLE ONLY public.fases DROP CONSTRAINT fases_pkey;
       public            postgres    false    202            7           2606    16455    metodologia metodologia_pkey 
   CONSTRAINT     f   ALTER TABLE ONLY public.metodologia
    ADD CONSTRAINT metodologia_pkey PRIMARY KEY (id_metodologia);
 F   ALTER TABLE ONLY public.metodologia DROP CONSTRAINT metodologia_pkey;
       public            postgres    false    203            9           2606    24606    proyecto proyecto_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.proyecto
    ADD CONSTRAINT proyecto_pkey PRIMARY KEY (id_proyecto);
 @   ALTER TABLE ONLY public.proyecto DROP CONSTRAINT proyecto_pkey;
       public            postgres    false    204            �   �   x�e�M
�0FדS�%����v%n�6$�$Sj��� 
n?��x&r�R"9�P5��wV��|��|��p1�lp���r<�H�pN�qzʉ�O���f�Z�@+/�ȁ�'��>���$��3�?��Q�|?���� ��J��c?      �   �   x�mα�0���x�>��P6�L������	Kϴ0��������I(�$�hrrh-k�[q�+� M����eWf��*�󂉑ؓ�ׂ�i�B�8��G>f2���Aq"���#}�
�1+%TX�3�� ה(v��)O��zdcZrz#8�����;�T�N�$V`�Sݡ�j�/.+����b�      �   G   x�3�t�K��,�,VHIUJ-,�K򋹌8]2�So��g���&rs:�d�e&'&g��q��qqq ���      �   %   x�3�
�4�2�(�/�/�,HL��4����� o�<      �   �   x�E�1�0k�����(�A��1�&����9�� "���ncN<̏ �=�9\3LC���9s@����PX�{��2�,\R�j�m7��?K۩�1US�I!*=�&� =ֺ��3�3ǐ��3m���\���BKZ�؇����Z���E]     